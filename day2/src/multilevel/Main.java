package multilevel;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Brand
        Brand brand = new Brand();
        brand.Proid = 101;
        brand.ProName = "Smartphone";
        brand.ProPrice = 699.99;
        brand.CatId = 10;
        brand.CatName = "Electronics";
        brand.BrandName = "TechBrand";

        // Display details
        brand.Display();
    }
}
