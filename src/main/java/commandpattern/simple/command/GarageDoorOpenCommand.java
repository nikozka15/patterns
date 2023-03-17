package commandpattern.simple.command;

import commandpattern.simple.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }
}
