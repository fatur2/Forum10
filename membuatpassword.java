public class membuatpassword {

		public static void main(String[] args) {
			String nama = "Universitasmerdeka";
			
			if (nama.length() < 10) {
				System.out.println("Password kamu terlalu pendek (min 10 character)");
			}else if (nama.length() > 20) {
				System.out.println("Password kamu salah terlalu panjang (max 20 character)");
			}else {
				System.out.println("Selamat pembuatan password berhasil");
			}
		}

	}