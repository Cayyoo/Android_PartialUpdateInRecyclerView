# RecyclerView局部更新

```java
btnMain.setOnClickListener(new View.OnClickListener() {//RecyclerView的局部更新
      @Override
      public void onClick(View v) {
          mMyAdapter.data[0] = "局部更新[0]：0000000";
          mMyAdapter.data[2] = "局部更新[2]：2222222";
          mMyAdapter.notifyItemChanged(0);
          mMyAdapter.notifyItemChanged(2);

          Toast.makeText(MainActivity.this,"局部更新了[0]和[2]",Toast.LENGTH_SHORT).show();
      }
});
```

![screenshot](https://github.com/ykmeory/PartialUpdateInRecyclerView/blob/master/screenshot.jpg "截图")
