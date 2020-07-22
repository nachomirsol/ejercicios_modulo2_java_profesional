package principal;

import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {
		Stream<String> cursos=Stream.of("Principios de Java","JavaScript","PHP",".NET","c++","Aprenda Java ya","Python","Java EE","Todo Java","Linux");
		//muestra el primer t�tulo que contanga la palabra Java, seg�n orden alfab�tico, y si no
		//existe que muestre no encontrado
		System.out.println(cursos
				.map(s->s.toLowerCase())
				.filter(p->p.contains("java"))
				.sorted()
				.findFirst()
				.orElse("No encontrado")
				);
	}

}
