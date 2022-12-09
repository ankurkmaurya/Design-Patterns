package com.ankurmaurya.creational.prototype;

import java.util.EnumMap;
import java.util.Map;

public class PrototypeFactory {

	private static Map<PrototypeType, PrototypeCapable> prototypes = new EnumMap<>(PrototypeType.class);
	
	static {
		prototypes.put(PrototypeType.MOVIE, new Movie());
		prototypes.put(PrototypeType.ALBUM, new Album());
		prototypes.put(PrototypeType.SHOW, new Show());
	}

	public static PrototypeCapable getInstance(final PrototypeType prototypeType) throws CloneNotSupportedException {
		return prototypes.get(prototypeType).clone();
	}
	
	private PrototypeFactory() {}
	
}
