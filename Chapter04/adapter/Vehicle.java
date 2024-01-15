class Vehicle {
    private final Engine engine;

    Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Vehicle, drive");
        engine.run();
    }

    public void refuel(){
        System.out.println("Vehicle, stop");
        switch (engine){
            case ElectricEngine ee -> {
                System.out.println("Vehicle needs recharge");
                ee.checkPlug();
                ee.tank();
            }
            case PetrolEngine pe -> {
                System.out.println("Vehicle needs petrol");
                pe.tank();
            }
            default -> throw new IllegalStateException("Vehicle has no engine");
        }
    }
}
