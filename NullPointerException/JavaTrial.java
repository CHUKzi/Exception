public class JavaTrial {
    public static void main(String[ ] args) {
        try {
          throw new NullPointerException();
          //System.out.println(args[0]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("no argivement have given");
        } catch (NullPointerException e) {
            System.out.println("A null pinted exception"); 
        } catch (Exception e) {
            System.out.println("Something went wrong."); 
        }
      }
    }