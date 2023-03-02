public class enum_class {
    public static <String> void main(String[] args) {
        enum Seasons{
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN,

        }
        Seasons mySeason = Seasons.SPRING;
        switch (mySeason){
            case SPRING -> {
                System.out.println("Весной светит солнце  ");
                System.out.println("С праздником пасхи ");
            }
            case SUMMER ->{
                System.out.println("Летом ярче светит солнце  ");
                System.out.println("Едем на бассейн  ");

            }
        }








    }

}
