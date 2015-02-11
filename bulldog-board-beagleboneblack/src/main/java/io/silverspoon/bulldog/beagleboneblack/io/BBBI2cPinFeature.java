package io.silverspoon.bulldog.beagleboneblack.io;

import io.silverspoon.bulldog.core.gpio.Pin;
import io.silverspoon.bulldog.core.io.bus.i2c.AbstractI2cPinFeature;
import io.silverspoon.bulldog.core.io.bus.i2c.I2cBus;
import io.silverspoon.bulldog.core.io.bus.i2c.I2cSignalType;

public class BBBI2cPinFeature extends AbstractI2cPinFeature {

   public BBBI2cPinFeature(I2cBus bus, Pin pin, I2cSignalType signalType) {
      super(pin, signalType);
      // TODO Auto-generated constructor stub
   }

   @Override
   public boolean isBlocking() {
      return false;
   }

   @Override
   protected void setupImpl() {
   }

   @Override
   protected void teardownImpl() {
   }

   @Override
   public I2cBus getI2cBus() {
      return null;
   }

}
