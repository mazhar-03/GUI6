package task2;


public class Garment implements Comparable<Garment>{
    private Size size;
    private int price;
    private String material;

    public Garment(Size size, int price, String material) {
        this.size = size;
        this.price = price;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Garment{" +
                "price=" + price +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
    public int compareTo(Garment g){
        return this.size.ordinal() - g.size.ordinal();
    }
}
