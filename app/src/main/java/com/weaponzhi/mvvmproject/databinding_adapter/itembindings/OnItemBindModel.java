package com.weaponzhi.mvvmproject.databinding_adapter.itembindings;


import org.sojex.finance.bindingcollectionadapter.ItemBinding;
import org.sojex.finance.bindingcollectionadapter.OnItemBind;

/**
 * An {@link OnItemBind} that selects item views by delegating to each item. Items must implement
 * {@link ItemBindingModel}.
 */
public class OnItemBindModel<T extends ItemBindingModel> implements OnItemBind<T> {

    @Override
    public void onItemBind(ItemBinding itemBinding, int position, T item) {
        item.onItemBind(itemBinding);
    }
}
