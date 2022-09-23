public class U2L2Runner {
    public static void main(String[] args) {
        int wid = 125;
        Rectangle pool = new Rectangle(150, wid);
        int poolPerimeter = pool.getLength()*2 + pool.getWidth()*2;
        pool.printRectangleInfo();
        System.out.println(poolPerimeter);
        Rectangle garden = new Rectangle(wid);
        int gardenPerimeter = garden.getLength()*2 + garden.getWidth()*2;
        garden.printRectangleInfo();
        System.out.println(gardenPerimeter);
        Rectangle playground = new Rectangle();
        playground.setWidth(125);
        int playgroundPerimeter = playground.getLength()*2 + playground.getWidth()*2;
        playground.printRectangleInfo();
        System.out.println(playgroundPerimeter);
        int totalPerimeter = poolPerimeter + gardenPerimeter + playgroundPerimeter;
        System.out.println("The total perimeter is " + totalPerimeter + "feet");









    }
}
