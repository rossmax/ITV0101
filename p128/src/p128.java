
public class p128{

public static void main(String[] args) {
	int maxlinelen = 1025;
	int g = 34943;
	int nCRC = 0;
	int m = 15648632;
	int m2 = 0;
	m2 = (m*(2^16))%g;
	
	if(m2 % g != 0) System.out.print("Error");
	System.out.println(m2);
	
}
}