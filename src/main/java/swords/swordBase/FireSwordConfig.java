package swords.swordBase;

import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.Map;

public record FireSwordConfig(String name, int amount, ArrayList<String> lore, Map<Enchantment, Integer> enchantments) {}
