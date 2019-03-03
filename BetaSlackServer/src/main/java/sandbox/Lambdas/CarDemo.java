package sandbox.Lambdas;

import java.util.List;

public class CarDemo {
    public static void main(String[] args) {
        CarsCollectionView view = new CarsCollectionView();
        int userPrice = 25000;
        int lowerYearLimit = 2002;
        int upperYearLimit = 2015;
        view.applyFilter(car -> {
                return  car.getProducedIn() >= lowerYearLimit &&
                        car.getPrice() > userPrice &&
                        car.getProducedIn() <= upperYearLimit;
        });
    }
}
