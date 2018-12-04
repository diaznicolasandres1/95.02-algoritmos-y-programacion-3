" 7507/9502 | 2018 2C | TP0 | Enunciado 3 "

| error alumno1 alumno2 alumno3 curso promedio aprobo |

Transcript clear.
error := false.

alumno1 := Alumno new.
alumno1 establecerNombre: 'Jorge'.

alumno2 := Alumno new.
alumno2 establecerNombre: 'Nelly'.

alumno3 := Alumno new.
alumno3 establecerNombre: 'Ramiro'.

curso := Curso new.
curso establecerNombre: 'Introduccion a la astronomia'.

curso inscribirAlumno: alumno1 conNumeroDePadron: 123456.
curso inscribirAlumno: alumno2 conNumeroDePadron: 123457.
curso inscribirAlumno: alumno3 conNumeroDePadron: 123458.

" Primer examen parcial "
curso calificarA: 123456 conNota: 2.
curso calificarA: 123457 conNota: 7.
curso calificarA: 123458 conNota: 6.

" Segundo examen parcial "
curso calificarA: 123456 conNota: 0.
curso calificarA: 123457 conNota: 4.
curso calificarA: 123458 conNota: 10.

" Trabajo practico "
curso calificarA: 123456 conNota: 9.
curso calificarA: 123457 conNota: 2.
curso calificarA: 123458 conNota: 8.

promedio := curso promedioDe: 123456.
(promedio closeTo: 11/3) ifFalse: [
    Transcript show: 'Error. El promedio de Jorge debe ser 11/3.' ; cr.
    error := true.
].

aprobo := curso aprobo: 123456. " Su promedio no llega al 4. "
aprobo ifTrue: [
    Transcript show: 'Error. Jorge no aprobó por poco.' ; cr.
    error := true.
].

promedio := curso promedioDe: 123457.
(promedio closeTo: 13/3) ifFalse: [
    Transcript show: 'Error. El promedio de Nelly debe ser 13/3.' ; cr.
    error := true.
].

aprobo := curso aprobo: 123457. " Su promedio supera el 4. "
aprobo ifFalse: [
    Transcript show: 'Error. Nelly aprobo con lo justo.' ; cr.
    error := true.
].

promedio := curso promedioDe: 123458.
(promedio = 8) ifFalse: [
    Transcript show: 'Error. El promedio de Ramiro debe ser 8.' ; cr.
    error := true.
].

aprobo := curso aprobo: 123458. " Su promedio supera el 4. "
aprobo ifFalse: [
    Transcript show: 'Error. Ramiro aprobo con buena nota.' ; cr.
    error := true.
].

" Resultado final. "
error ifTrue: [  
	Transcript show: 'Resultado final: ERROR'.
]
ifFalse: [
	Transcript show: 'Resultado final: OK'.
].
