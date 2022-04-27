public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithParty remoteControl = new RemoteControlWithParty();

        Light light = new Light("Living room");
        TV tv = new TV("Living room");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, tvOn, stereoOn, hottubOn };
        Command[] partyOff = { lightOff, tvOff, stereoOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Pushing Macro Undo---");
        remoteControl.undoButtonWasPushed();

    }
}