package com.zetaplugins.lifestealz.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.UUID;

public final class CooldownManager {
    public static Map<UUID, Long> lastHeartUse = new ConcurrentHashMap<>();
    public static Map<UUID, Long> lastHeartGain = new ConcurrentHashMap<>();
    public static Map<UUID, Long> lastHeartPickupMessage = new ConcurrentHashMap<>();
}
