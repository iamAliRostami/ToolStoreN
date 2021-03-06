package com.leon.tool_store.Adapter.Item;


import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class ItemDataSourceFactory extends DataSource.Factory {

    //creating the mutable live data
    private MutableLiveData<PageKeyedDataSource<Integer, Item>> itemLiveDataSource;

    @Override
    public DataSource<Integer, Item> create() {
        //getting our data source object
        ItemDataSource itemDataSource = new ItemDataSource();
        itemLiveDataSource = new MutableLiveData<>();
        //posting the datasource to get the values
        itemLiveDataSource.postValue(itemDataSource);
        //returning the datasource
        return itemDataSource;
    }

    //getter for itemlivedatasource
    public MutableLiveData<PageKeyedDataSource<Integer, Item>> getItemLiveDataSource() {
        return itemLiveDataSource;
    }
}