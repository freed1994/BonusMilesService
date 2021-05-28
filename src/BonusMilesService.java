public class BonusMilesService {
    public int calculateBonus(int ticketPrice) {
        int priceOneMile = 20;
        int bonusMiles;
        bonusMiles = ticketPrice / priceOneMile;
        return bonusMiles;
    }
}
