class MacBook{
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;
    public MacBook() {
        this.keyboard = new WiredKeyboard(keyboard, mouse);
        this.mouse = new WiredMouse();
    }
}

// here we have used concreate classes rather than interfaces
// lets say if i want to use bluetooth keyboard then i cant use it.


class MacBook{
    private final Keyboard keyboard;
    private final Mouse mouse;
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}


interface Keyboard{

}

interface Mouse{

}

class WiredKeyboard implements Keyboard{

}

class WiredMouse implements Mouse{

}

class BluetoothKeyboard implements Keyboard{

}

class BluetoothMouse implements Mouse{

}