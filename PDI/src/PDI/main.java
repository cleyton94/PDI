package PDI;
import PDI.ImagemDigital;

public class main {
	
	public static void main(String[] args) throws Exception {
		
		int[][] imagem = ImagemDigital.carregarImagem("C:/imagens/Fig0222(a)(face).png");
		ImagemDigital.plotarImagem(imagem, "nome");
		// salvarImagemPNG(imagem, "teste.png");
	}
	

}
