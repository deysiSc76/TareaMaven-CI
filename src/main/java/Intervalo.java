import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

/**
Esta clase representa el concepto matematico que intervalos.
Es decir representa todos los valores entre uno y otro.
Con esto luego puedes preguntar si un valor están dentro de un intervalo
o no.
*/
public class Intervalo {

private int _min;

private int _max;

public Intervalo(int min, int max) {
if (min > max) {
throw new IllegalArgumentException( "valor min " + min +
" no deberia ser mayor a valor max " + max);
}else if(min<0) {
	throw new IllegalArgumentException( "El minimo no puede ser un numero negativo");
}else if(max<0) {
	throw new IllegalArgumentException( "El máximo no puede ser un numero negativo");
}
_min = min;
_max = max;
}

public int reduce(int init, BinaryOperator<Integer> op) throws Exception {
	int res;
	
	if(init<0) {
		throw new IOException("el numero que devuelve el init no puede ser menor a cero");
		}
	res=IntStream.range(_min, _max).reduce(init, (IntBinaryOperator) op);

    assert init >= 0;
     return res;
    
}

public int sumatoria() throws Exception {

	int sumatoria= IntStream.range(_min, _max).reduce(0, (x,y)->x+y);
    return sumatoria;
}

public int producto() throws Exception {
	int sumatoria= IntStream.range(_min, _max).reduce(1, (x,y)->x*y);
    return sumatoria;
}
}