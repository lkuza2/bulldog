package org.bulldog.core.gpio.base;

import org.bulldog.core.Signal;
import org.bulldog.core.gpio.DigitalOutput;
import org.bulldog.core.gpio.Pin;
import org.bulldog.core.gpio.util.Blinker;

public abstract class AbstractDigitalOutput extends AbstractPinFeature implements DigitalOutput {

	private static final String NAME_FORMAT = "Digital Output - Signal '%s' on Pin %s";
	
	private Signal signal = Signal.Low;
	private Blinker blinker;

	public AbstractDigitalOutput(Pin pin) {
		super(pin);
		blinker = new Blinker(this);
	}
	
	public String getName() {
		return String.format(NAME_FORMAT, signal, getPin().getName());
	}

	public void digitalWrite(Signal signal) {
		applySignal(signal);
	}
	
	public void applySignal(Signal signal) {
		this.signal = signal;
		applySignalImpl(this.signal);
	}

	public void high() {
		applySignal(Signal.High);
	}

	public void low() {
		applySignal(Signal.Low);
	}
	
	public boolean isHigh() {
		return signal == Signal.High;
	}
	
	public boolean isLow() {
		return signal == Signal.Low;
	}

	public void toggle() {
		applySignal(signal == Signal.High ? Signal.Low : Signal.High);
	}

	public Signal getAppliedSignal() {
		return signal;
	}
	
	public void startBlinking(int periodMilliseconds) {
		blinker.startBlinking(periodMilliseconds);
	}
	
	public void startBlinking(int periodMilliseconds, int durationMilliseconds) {
		blinker.startBlinking(periodMilliseconds, durationMilliseconds);
	}
	
	public void stopBlinking() {
		blinker.stopBlinking();
	}
	
	protected abstract void applySignalImpl(Signal signal);
}
