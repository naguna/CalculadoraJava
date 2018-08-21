package com.privalia.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.privalia.dao.AlumnoDao;
import com.privalia.common.Alumno;

public class AlumnoDaoTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		
		// 1. Crear un alumno de prueba	
		Alumno alumno = new Alumno();	 	
		// 2. Instanciar el AlumnoDao
		AlumnoDao alumnoDao = new AlumnoDao();		
		// 3. Llamar al método add enviando el alumno de prueba creado
		AlumnoDao.add(alumno);
		// 4. Devolver el alumno escrito en el fichero alumno.txt
		// 5. Comprobar que el alumno escrito sean iguales.
	}

}
