package com.xworkz.runner;

import com.xworkz.internal.*;

public class MainRunner {
    public static void main(String[] args) {
        Fan fan = new FanImpl();
        fan.changeSpeed();
        fan.turnOff();
        fan.turnOn();
        Oven oven = new OvenImpl();
        oven.bake();
        oven.preheat();
        oven.shutDown();
        Laptop laptop = new LaptopImpl();
        laptop.powerOn();
        laptop.runProgram();
        laptop.sleepMode();
        Phone phone = new PhoneImpl();
        phone.makeCall();
        phone.sendText();
        phone.takePhoto();
        Car car = new CarImpl();
        car.accelerate();
        car.brake();
        car.accelerate();
        Camera camera = new CameraImpl();
        camera.capture();
        camera.zoomIn();
        camera.zoomOut();
        Watch watch = new WatchImpl();
        watch.setAlarm();
        watch.showTime();
        watch.startTimer();
        Television television = new TelevisionImpl();
        television.increaseVolume();
        television.powerOff();
        television.switchChannel();
        Microwave microwave = new MicrowaveImpl();
        microwave.setTimer();
        microwave.startHeating();
        microwave.stopHeating();
        Printer printer = new PrinterImpl();
        printer.cancelJob();
        printer.printDocument();
        printer.scanDocument();
        Router router = new RouterImpl();
        router.resetRouter();
        router.checkSignal();
        router.connectInternet();
        Refrigerator refrigerator = new RefrigeratorImpl();
        refrigerator.coolItems();
        Speaker speaker = new SpeakerImpl();
        speaker.adjustVolume();
        speaker.pauseMusic();
        speaker.playMusic();
        Projector projector = new ProjectorImpl();
        projector.adjustFocus();
        projector.powerDown();
        projector.projectImage();
        Headphones headphones = new HeadphonesImpl();
        headphones.connectBluetooth();
        headphones.connectBluetooth();
        headphones.decreaseVolume();
        Tablet tablet = new TabletImpl();
        tablet.lockDevice();
        tablet.openApp();
        tablet.rotateScreen();
        Desk desk = new DeskImpl();
        desk.adjustHeight();
        desk.closeDrawer();
        desk.openDrawer();
        Chair chair = new ChairImpl();
        chair.recline();
        chair.sit();
        chair.roll();
        Shoe shoe = new ShoeImpl();
        shoe.remove();
        shoe.tieLaces();
        shoe.wear();
        Book book = new BookImpl();
        book.bookmarkPage();
        Pen pen = new PenImpl();
        pen.draw();
        Lamp lamp = new LampImpl();
        lamp.switchOff();
        Mug mug = new MugImpl();
        mug.clean();
        mug.sip();
        mug.fill();
        Bottle bottle = new BottleImpl();
        bottle.closeCap();
        bottle.openCap();
        bottle.pourWater();

        Backpack backpack = new BackpackImpl();
        backpack.storeItem();
        backpack.zipClose();
        backpack.zipOpen();
        Window window = new WindowImpl();
        window.closeWindow();
        window.closeWindow();
        window.openWindow();
        Door door = new DoorImpl();
        door.closeDoor();
        door.openDoor();
        door.closeDoor();
        Bicycle bicycle = new BicycleImpl();
        bicycle.brake();
        Scooter scooter = new ScooterImpl();
        scooter.kickStart();
        scooter.park();
        scooter.ride();
        Drill drill = new DrillImpl();
        drill.startDrill();
        drill.stopDrill();
        drill.changeBit();
        Hammer hammer = new HammerImpl();
        Keyboard keyboard = new KeyboardImpl();
        Mouse mouse = new MouseImpl();
        Monitor monitor = new MonitorImpl();
        Calculator calculator = new CalculatorImpl();
        Remote remote = new RemoteImpl();
        Fridge fridge = new FridgeImpl();
        WashingMachine washingmachine = new WashingMachineImpl();
        Dishwasher dishwasher = new DishwasherImpl();
        Toaster toaster = new ToasterImpl();
        Mixer mixer = new MixerImpl();
        Blender blender = new BlenderImpl();
        Juicer juicer = new JuicerImpl();
        AirConditioner airconditioner = new AirConditionerImpl();
        Heater heater = new HeaterImpl();
        VacuumCleaner vacuumcleaner = new VacuumCleanerImpl();
        Broom broom = new BroomImpl();
        Mop mop = new MopImpl();
        Sunglasses sunglasses = new SunglassesImpl();
        Helmet helmet = new HelmetImpl();
        Flashlight flashlight = new FlashlightImpl();
        Rope rope = new RopeImpl();
        Ladder ladder = new LadderImpl();
        Notebook notebook = new NotebookImpl();
        Stapler stapler = new StaplerImpl();
        Globe globe = new GlobeImpl();
        Whiteboard whiteboard = new WhiteboardImpl();
        Calendar calendar = new CalendarImpl();
        Clock clock = new ClockImpl();
        Bed bed = new BedImpl();
        Mattress mattress = new MattressImpl();
        Pillow pillow = new PillowImpl();
        Blanket blanket = new BlanketImpl();
        Comb comb = new CombImpl();
        Brush brush = new BrushImpl();
        Toothbrush toothbrush = new ToothbrushImpl();
        Towel towel = new TowelImpl();
        Plate plate = new PlateImpl();
        Bowl bowl = new BowlImpl();
        Spoon spoon = new SpoonImpl();
        Fork fork = new ForkImpl();
        Knife knife = new KnifeImpl();
        Fan fan1 = new FanOvenDevice();
        Oven oven1 = new FanOvenDevice();

        Oven oven2 = new OvenLaptopDevice();
        Laptop laptop1 = new OvenLaptopDevice();

        Laptop laptop2 = new LaptopPhoneDevice();
        Phone phone1 = new LaptopPhoneDevice();

        Phone phone2 = new PhoneCarDevice();
        Car car1 = new PhoneCarDevice();

        Car car2 = new CarCameraDevice();
        Camera camera1 = new CarCameraDevice();

        Camera camera2 = new CameraWatchDevice();
        Watch watch1 = new CameraWatchDevice();

        Watch watch2 = new WatchTelevisionDevice();
        Television tv1 = new WatchTelevisionDevice();

        Television tv2 = new TelevisionMicrowaveDevice();
        Microwave microwave1 = new TelevisionMicrowaveDevice();

        Microwave microwave2 = new MicrowavePrinterDevice();
        Printer printer1 = new MicrowavePrinterDevice();

        Printer printer2 = new PrinterRouterDevice();
        Router router1 = new PrinterRouterDevice();

        Router router2 = new RouterRefrigeratorDevice();
        Refrigerator fridge1 = new RouterRefrigeratorDevice();

        Refrigerator fridge2 = new RefrigeratorSpeakerDevice();
        Speaker speaker1 = new RefrigeratorSpeakerDevice();

        Speaker speaker2 = new SpeakerProjectorDevice();
        Projector projector1 = new SpeakerProjectorDevice();

        Projector projector2 = new ProjectorHeadphonesDevice();
        Headphones headphones1 = new ProjectorHeadphonesDevice();

        Headphones headphones2 = new HeadphonesTabletDevice();
        Tablet tablet1 = new HeadphonesTabletDevice();

        Tablet tablet2 = new TabletDeskDevice();
        Desk desk1 = new TabletDeskDevice();

        Desk desk2 = new DeskChairDevice();
        Chair chair1 = new DeskChairDevice();

        Chair chair2 = new ChairShoeDevice();
        Shoe shoe1 = new ChairShoeDevice();

        Shoe shoe2 = new ShoeBookDevice();
        Book book1 = new ShoeBookDevice();

        Book book2 = new BookPenDevice();
        Pen pen1 = new BookPenDevice();

        Pen pen2 = new PenLampDevice();
        Lamp lamp1 = new PenLampDevice();

        Lamp lamp2 = new LampMugDevice();
        Mug mug1 = new LampMugDevice();

        Mug mug2 = new MugBottleDevice();
        Bottle bottle1 = new MugBottleDevice();

        Bottle bottle2 = new BottleBackpackDevice();
        Backpack backpack1 = new BottleBackpackDevice();

        Backpack backpack2 = new BackpackWindowDevice();
        Window window1 = new BackpackWindowDevice();

    }
}
