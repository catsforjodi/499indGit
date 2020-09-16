public class birthstone {
    public static String birthstone(String month) {
        String months[] = {"january","february","march", "april","may","june","july","august","september", "october", "november", "december"};
        String stones[] = {"garnet","amethyst","aquamarine","diamond","emerald","pearl & moonstone","ruby, onyx & turquoise","peridot,ardonyx & spinel","sapphire","opal & tourmaline","topaz & citrine","turquoise & zircon & tanzanite"};

        month.toLowerCase();
        for(int i = 0; i < months.length;i++){
            if(months[i] == month){
                return stones[i];
                            }
        }
		return "invalid month";

    }
}
 
