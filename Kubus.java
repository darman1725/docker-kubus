import java.util.Scanner;

public class Kubus {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sisi, tinggi, alas, nim;
		float luas;
		float volumekubus, volumelimas,volumetotal;
		String nama,kelas;

		System.out.println("Masukkan Nama\t\t: ");
		nama = sc.nextLine();
		System.out.println("Masukkan Kelas\t\t: ");
		kelas = sc.nextLine();
		System.out.println("Masukkan Nim\t\t: ");
		nim = sc.nextInt();

		System.out.println("Masukan sisi kubus\t: ");
		sisi = sc.nextInt();
		System.out.println("Masukkan tinggi limas\t\t: ");
		tinggi = sc.nextInt();


		luas = sisi * sisi;
		volumekubus = sisi * sisi * sisi;
		volumelimas = ((1F/3F) * luas * tinggi);
		volumetotal = volumekubus + volumelimas;

		System.out.println("Nama Saya  " + nama);
		System.out.println("Kelas Saya  " + kelas);
		System.out.println("Nim Saya " + nim);
		System.out.println(String.format("Luas salah satu sisi kubus adalah %.2f", luas));
		System.out.println(String.format("Volume Kubus %.2f", volumekubus));
		System.out.println(String.format("Volume Limas %.2f", volumelimas));
		System.out.println(String.format("Volume Total %.2f", volumetotal));
		
	}
}