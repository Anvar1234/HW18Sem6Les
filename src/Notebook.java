public class Notebook {
    public String brand;
    public String color;

    public Notebook(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public static void searchByColor() {


    }

    @Override
    public String toString() {
        return String.format("Ноутбук = бренд: %s, цвет: %s",brand, color);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Notebook)
//            return ((Notebook) obj).brand.equals(this.brand) ||
//                    ((Notebook) obj).color.equals(this.color);
//        else return false;
//    }


}
