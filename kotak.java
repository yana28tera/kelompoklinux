import java.util.*
class kotak {
	double panjang;
	double lebar;
	double tinggi;
}

class demo kotak1{
	public static void main(String[]args){
	
	double volume;
	kotak k = new kotak();
	k.panjang = 4;
	k.lebar = 3;
	k.tinggi = 2;

volume = k.panjang * k.tinggi * k.lebar;
System.out.println("Volume kotak = " + volume);

}
}