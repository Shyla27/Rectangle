public class App {
   public static void main(String[] args) {

       get("/", (req, res) -> {
           Rectangle rectangle = new Rectangle(3,2);
           Rectangle otherRectangle = new Rectangle(12, 12);

           Map<String, ArrayList<Rectangle>> model = new HashMap<>();
           ArrayList myRectangleArrayList = Rectangle.getAll();
           model.put("myRectangles", myRectangleArrayList);
           return new ModelAndView(model, "index.hbs");
       }, new HandlebarsTemplateEngine());
   }
}
