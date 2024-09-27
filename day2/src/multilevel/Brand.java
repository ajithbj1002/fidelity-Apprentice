package multilevel;

public class Brand extends Category {
    String BrandName;

    @Override
    public void Display() {
        System.out.println("BrandName: " + BrandName);
        super.Display(); // Control goes to category base class
    }
}
