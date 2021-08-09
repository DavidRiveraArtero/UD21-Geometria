package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Geometria.Geometria;


public class GeometriaTest {
	

	//AREA AREA_CUADRADO
	@Test
	public void TestAreaCuadrado() {
		int resultado = Geometria.areacuadrado(3);
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	//AREA CIRCULO
	@Test
	public void TestAreaCirculo() {
		double resultado = Geometria.areaCirculo(10);
		double esperado = 314.15999999999997;
		assertEquals(esperado, resultado);
	}
	
	//AREA TRIANGULO
	@Test
	public void TestTriangulo() {
		int resultado = Geometria.areatriangulo(5, 2);
		System.out.println();
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestRectangulo() {
		int resultado = Geometria.arearectangulo(3, 2);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestPentagono() {
		int resultado = Geometria.areapentagono(10, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestRombo() {
		int resultado = Geometria.arearombo(10, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestRomboide() {
		int resultado = Geometria.arearomboide(10, 2);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestAretaEspacio() {
		int resultado = Geometria.areatrapecio(5, 2, 3);
		System.out.println(resultado);
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void SelectorFigura() {
		assertTrue(Geometria.figuras(1) == "cuadrado");
        assertTrue(Geometria.figuras(2) == "Circulo");
        assertTrue(Geometria.figuras(3) == "Triangulo");
        assertTrue(Geometria.figuras(4) == "Rectangulo");
        assertTrue(Geometria.figuras(5) == "Pentagono");
        assertTrue(Geometria.figuras(6) == "Rombo");
        assertTrue(Geometria.figuras(7) == "Romboide");
        assertTrue(Geometria.figuras(8) == "Trapecio");
        assertTrue(Geometria.figuras(9) == "Default");
	}
	
	@Test
	public void Getters () {
		Geometria geo = new Geometria(); 
		geo.setArea(3);
		geo.setId(2);
		geo.setNom("ejemplo");
		
		assertEquals(2,geo.getId());
		assertEquals("ejemplo",geo.getNom());
		assertEquals(3,geo.getArea());
	}
	
	@Test
	public void TestConstructor() {
		Geometria geo = new Geometria(1);
		geo.setArea(3);
		Geometria geo2 = new Geometria();
		geo2.setArea(2);
		
	}
	@Test
	public void TestToString() {
		Geometria geo = new Geometria(1);
		
		String Texto = "Geometria [id=" + geo.getId() + ", nom=" + geo.getNom() + ", area=" + geo.getArea() + "]";
		assertEquals(Texto, geo.toString());
		
	}
		
	
	
	
	
}
