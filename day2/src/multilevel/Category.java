package multilevel;

public class Category extends product {
    int CatId;
    String CatName;

    // Method Overriding
    @Override
    public void Display() {
        System.out.println("Category ID: " + CatId + "\nCategoryName: " + CatName);
        super.Display(); // Control goes to base class display method
    }
}
