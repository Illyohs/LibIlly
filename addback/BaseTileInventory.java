package us.illyohs.libilly.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.IChatComponent;

public class BaseTileInventory extends BaseTile implements IInventory {

    protected ItemStack[] inventorySize;
    protected int         stackLimit;
    protected String      invName;

    public BaseTileInventory(int size, int limit, String name) {
        inventorySize = new ItemStack[size];
        this.stackLimit = limit;
        this.invName = name;
    }

    @Override
    public void updateTile() {

    }

    @Override
    public void readFromModNBT(NBTTagCompound mNBT) {
//        NBTTagList invList = new NBTTagList();
        NBTTagList items = mNBT.getTagList("Items", 10);

        for (int i = 0; i < items.tagCount(); i++) {
            NBTTagCompound item = (NBTTagCompound)items.getCompoundTagAt(i);
            int slots = item.getByte("Slot");
            	if (slots >= 0 && slots < getSizeInventory()) {
				setInventorySlotContents(slots, ItemStack.loadItemStackFromNBT(item));
			}

        }
    }

    @Override
    public void writeToModNBT(NBTTagCompound mNBT) {

	NBTTagList items = new NBTTagList();

		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack stack = getStackInSlot(i);

			if (stack != null) {
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte)i);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}

		mNBT.setTag("Items", items);
    }

    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {

    }

    @Override
    public int getSizeInventory() {
        return inventorySize.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return inventorySize[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {

        if (inventorySize[index] != null) {

            ItemStack iStack;

            if (inventorySize[index].stackSize <= count) {

                iStack = inventorySize[index];
                inventorySize[index] = null;
                return iStack;

            } else {

                iStack = inventorySize[index].splitStack(count);

                if (inventorySize[index].stackSize == 0)
                        inventorySize[index] = null;

                return iStack;
            }
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        return getStackInSlot(index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
		inventorySize[index] = stack;

		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = getInventoryStackLimit();
		}

    }

    @Override
    public int getInventoryStackLimit() {
        return stackLimit;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getDistanceSq(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5) <= 64;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getCommandSenderName() {
        return invName;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return null;
    }
}
