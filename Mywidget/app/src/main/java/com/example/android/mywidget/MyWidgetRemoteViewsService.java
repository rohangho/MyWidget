package com.example.android.mywidget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

/**
 * Created by ROHAN on 07-10-2017.
 */



    public class MyWidgetRemoteViewsService extends RemoteViewsService {
        @Override
        public RemoteViewsFactory onGetViewFactory(Intent intent) {
            return new MyWidgetRemoteViewsFactory(this.getApplicationContext());
        }

        class MyWidgetRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {

            private Context context;
            MainActivity obj=new MainActivity();

            public MyWidgetRemoteViewsFactory(Context context) {
                this.context = context;




            }

            @Override
            public void onCreate() {

            }

            @Override
            public void onDataSetChanged() {

            }

            @Override
            public void onDestroy() {

            }

            @Override
            public int getCount() {
                if(obj.abc!=null)
                    return obj.abc.length;
                else
                    return 0;
            }

            @Override
            public RemoteViews getViewAt(int position) {
                RemoteViews rv = new RemoteViews(context.getPackageName(), R.layout.widget_list);
                rv.setTextViewText(R.id.widgetItemTaskNameLabel, obj.abc[position]);
                return rv;
            }

            @Override
            public RemoteViews getLoadingView() {
                return null;
            }

            @Override
            public int getViewTypeCount() {
                return 1;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }
        }
    }



