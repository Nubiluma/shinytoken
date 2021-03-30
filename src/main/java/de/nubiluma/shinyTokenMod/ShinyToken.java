package de.nubiluma.shinyTokenMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;

public class ShinyToken extends Item {

    public ShinyToken() {
        setUnlocalizedName("token");
        setRegistryName(Main.MODID, "token");
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target, EnumHand hand) {
        String name = target.getName();
        player.sendMessage(new TextComponentString("Du hast ein " + name + " angeklickt!"));
        return super.itemInteractionForEntity(stack, player, target, hand);
    }

}
