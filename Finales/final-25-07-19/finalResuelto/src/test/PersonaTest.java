package test;
import comensales.ComensalCeliaco;
import comensales.ComensalComun;
import comida.ComidaComun;
import comida.ComidaSinGluten;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PersonaTest {

	@org.junit.Test
	public void personaNoCeliacaComeCosasParaNoCeliacosEstaTodoBien() {

		ComensalComun comensal = new ComensalComun();
		ComidaComun comida = new ComidaComun(10.0);
		comensal.comer(comida);
		assertThat(comensal.getCalorias(), is(10.0));

	}

	@org.junit.Test
	public void personaCeliacaComeCosasParaCeliacosEstaTodoBien() {

		ComensalCeliaco comensal = new ComensalCeliaco();
		ComidaSinGluten comida = new ComidaSinGluten(15.0);
		comensal.comer(comida);
		assertThat(comensal.getCalorias(), is(15.0));
	}

}
