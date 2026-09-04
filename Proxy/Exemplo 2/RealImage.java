public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Carregando imagem: " + filename);
    }

    public void display() {
        System.out.println("Exibindo imagem: " + filename + "\n");
    }
}