package com.smyy.sharetour.buyer.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.smyy.sharetour.buyer.db.HomeSearch;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HOME_SEARCH".
*/
public class HomeSearchDao extends AbstractDao<HomeSearch, Long> {

    public static final String TABLENAME = "HOME_SEARCH";

    /**
     * Properties of entity HomeSearch.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SearchContent = new Property(1, String.class, "searchContent", false, "SEARCH_CONTENT");
    }


    public HomeSearchDao(DaoConfig config) {
        super(config);
    }
    
    public HomeSearchDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HOME_SEARCH\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SEARCH_CONTENT\" TEXT);"); // 1: searchContent
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HOME_SEARCH\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HomeSearch entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String searchContent = entity.getSearchContent();
        if (searchContent != null) {
            stmt.bindString(2, searchContent);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HomeSearch entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String searchContent = entity.getSearchContent();
        if (searchContent != null) {
            stmt.bindString(2, searchContent);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public HomeSearch readEntity(Cursor cursor, int offset) {
        HomeSearch entity = new HomeSearch( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // searchContent
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HomeSearch entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSearchContent(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(HomeSearch entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(HomeSearch entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(HomeSearch entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
