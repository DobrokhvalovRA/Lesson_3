public class Park {
    private String name;
    public class Attraction{
        String nameAttr;
        String timeAttr;
        float priceAttr;
        Attraction(String nameAttr, String timeAttr, float priceAttr){
            this.nameAttr = nameAttr;
            this.timeAttr = timeAttr;
            this.priceAttr = priceAttr;
        }
    }

    Park(String name){
        this.name = name;
    }

    public void showPark (Park park, Park.Attraction attraction){
        System.out.println("Парк:  "+park.name + ".\n"  + "Атракционы:");
        System.out.println(attraction.nameAttr + "Время работы - " + attraction.timeAttr + "Стоимость - "+attraction.priceAttr + "р.");
    }
}
