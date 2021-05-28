public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000; //rub
        int priceOneMile = 20; //rub
        int bonusMiles = service.calculateBonus(ticketPrice);
        System.out.println("Бонусные мили:" + bonusMiles);
    }
}