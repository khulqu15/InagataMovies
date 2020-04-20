package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy extends com.nino.inagataMovie.favorites.MovieRealmObject
    implements RealmObjectProxy, com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface {

    static final class MovieRealmObjectColumnInfo extends ColumnInfo {
        long idIndex;
        long overviewIndex;
        long releaseDateIndex;
        long posterPathIndex;
        long backdropPathIndex;
        long titleIndex;
        long voteAverageIndex;

        MovieRealmObjectColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MovieRealmObject");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.overviewIndex = addColumnDetails("overview", "overview", objectSchemaInfo);
            this.releaseDateIndex = addColumnDetails("releaseDate", "releaseDate", objectSchemaInfo);
            this.posterPathIndex = addColumnDetails("posterPath", "posterPath", objectSchemaInfo);
            this.backdropPathIndex = addColumnDetails("backdropPath", "backdropPath", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.voteAverageIndex = addColumnDetails("voteAverage", "voteAverage", objectSchemaInfo);
        }

        MovieRealmObjectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MovieRealmObjectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MovieRealmObjectColumnInfo src = (MovieRealmObjectColumnInfo) rawSrc;
            final MovieRealmObjectColumnInfo dst = (MovieRealmObjectColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.overviewIndex = src.overviewIndex;
            dst.releaseDateIndex = src.releaseDateIndex;
            dst.posterPathIndex = src.posterPathIndex;
            dst.backdropPathIndex = src.backdropPathIndex;
            dst.titleIndex = src.titleIndex;
            dst.voteAverageIndex = src.voteAverageIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MovieRealmObjectColumnInfo columnInfo;
    private ProxyState<com.nino.inagataMovie.favorites.MovieRealmObject> proxyState;

    com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MovieRealmObjectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.nino.inagataMovie.favorites.MovieRealmObject>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$overview() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.overviewIndex);
    }

    @Override
    public void realmSet$overview(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.overviewIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.overviewIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.overviewIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.overviewIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$releaseDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.releaseDateIndex);
    }

    @Override
    public void realmSet$releaseDate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.releaseDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.releaseDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.releaseDateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.releaseDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$posterPath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.posterPathIndex);
    }

    @Override
    public void realmSet$posterPath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.posterPathIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.posterPathIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.posterPathIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.posterPathIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$backdropPath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.backdropPathIndex);
    }

    @Override
    public void realmSet$backdropPath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.backdropPathIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.backdropPathIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.backdropPathIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.backdropPathIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.titleIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.titleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.titleIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$voteAverage() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.voteAverageIndex);
    }

    @Override
    public void realmSet$voteAverage(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.voteAverageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.voteAverageIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MovieRealmObject", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("overview", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("releaseDate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("posterPath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("backdropPath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("voteAverage", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MovieRealmObjectColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MovieRealmObjectColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MovieRealmObject";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MovieRealmObject";
    }

    @SuppressWarnings("cast")
    public static com.nino.inagataMovie.favorites.MovieRealmObject createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.nino.inagataMovie.favorites.MovieRealmObject obj = null;
        if (update) {
            Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
            MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy) realm.createObjectInternal(com.nino.inagataMovie.favorites.MovieRealmObject.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy) realm.createObjectInternal(com.nino.inagataMovie.favorites.MovieRealmObject.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface objProxy = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) obj;
        if (json.has("overview")) {
            if (json.isNull("overview")) {
                objProxy.realmSet$overview(null);
            } else {
                objProxy.realmSet$overview((String) json.getString("overview"));
            }
        }
        if (json.has("releaseDate")) {
            if (json.isNull("releaseDate")) {
                objProxy.realmSet$releaseDate(null);
            } else {
                objProxy.realmSet$releaseDate((String) json.getString("releaseDate"));
            }
        }
        if (json.has("posterPath")) {
            if (json.isNull("posterPath")) {
                objProxy.realmSet$posterPath(null);
            } else {
                objProxy.realmSet$posterPath((String) json.getString("posterPath"));
            }
        }
        if (json.has("backdropPath")) {
            if (json.isNull("backdropPath")) {
                objProxy.realmSet$backdropPath(null);
            } else {
                objProxy.realmSet$backdropPath((String) json.getString("backdropPath"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("voteAverage")) {
            if (json.isNull("voteAverage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'voteAverage' to null.");
            } else {
                objProxy.realmSet$voteAverage((double) json.getDouble("voteAverage"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.nino.inagataMovie.favorites.MovieRealmObject createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.nino.inagataMovie.favorites.MovieRealmObject obj = new com.nino.inagataMovie.favorites.MovieRealmObject();
        final com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface objProxy = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("overview")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$overview((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$overview(null);
                }
            } else if (name.equals("releaseDate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$releaseDate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$releaseDate(null);
                }
            } else if (name.equals("posterPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$posterPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$posterPath(null);
                }
            } else if (name.equals("backdropPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$backdropPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$backdropPath(null);
                }
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("voteAverage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$voteAverage((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'voteAverage' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.nino.inagataMovie.favorites.MovieRealmObject copyOrUpdate(Realm realm, com.nino.inagataMovie.favorites.MovieRealmObject object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.nino.inagataMovie.favorites.MovieRealmObject) cachedRealmObject;
        }

        com.nino.inagataMovie.favorites.MovieRealmObject realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
            MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.nino.inagataMovie.favorites.MovieRealmObject copy(Realm realm, com.nino.inagataMovie.favorites.MovieRealmObject newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.nino.inagataMovie.favorites.MovieRealmObject) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.nino.inagataMovie.favorites.MovieRealmObject realmObject = realm.createObjectInternal(com.nino.inagataMovie.favorites.MovieRealmObject.class, ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface realmObjectSource = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) newObject;
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface realmObjectCopy = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$overview(realmObjectSource.realmGet$overview());
        realmObjectCopy.realmSet$releaseDate(realmObjectSource.realmGet$releaseDate());
        realmObjectCopy.realmSet$posterPath(realmObjectSource.realmGet$posterPath());
        realmObjectCopy.realmSet$backdropPath(realmObjectSource.realmGet$backdropPath());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$voteAverage(realmObjectSource.realmGet$voteAverage());
        return realmObject;
    }

    public static long insert(Realm realm, com.nino.inagataMovie.favorites.MovieRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$overview = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$overview();
        if (realmGet$overview != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.overviewIndex, rowIndex, realmGet$overview, false);
        }
        String realmGet$releaseDate = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
        if (realmGet$releaseDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate, false);
        }
        String realmGet$posterPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$posterPath();
        if (realmGet$posterPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.posterPathIndex, rowIndex, realmGet$posterPath, false);
        }
        String realmGet$backdropPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$backdropPath();
        if (realmGet$backdropPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, realmGet$backdropPath, false);
        }
        String realmGet$title = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.voteAverageIndex, rowIndex, ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$voteAverage(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.nino.inagataMovie.favorites.MovieRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.nino.inagataMovie.favorites.MovieRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$overview = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$overview();
            if (realmGet$overview != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.overviewIndex, rowIndex, realmGet$overview, false);
            }
            String realmGet$releaseDate = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
            if (realmGet$releaseDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate, false);
            }
            String realmGet$posterPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$posterPath();
            if (realmGet$posterPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.posterPathIndex, rowIndex, realmGet$posterPath, false);
            }
            String realmGet$backdropPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$backdropPath();
            if (realmGet$backdropPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, realmGet$backdropPath, false);
            }
            String realmGet$title = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.voteAverageIndex, rowIndex, ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$voteAverage(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.nino.inagataMovie.favorites.MovieRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$overview = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$overview();
        if (realmGet$overview != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.overviewIndex, rowIndex, realmGet$overview, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.overviewIndex, rowIndex, false);
        }
        String realmGet$releaseDate = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
        if (realmGet$releaseDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, false);
        }
        String realmGet$posterPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$posterPath();
        if (realmGet$posterPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.posterPathIndex, rowIndex, realmGet$posterPath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.posterPathIndex, rowIndex, false);
        }
        String realmGet$backdropPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$backdropPath();
        if (realmGet$backdropPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, realmGet$backdropPath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, false);
        }
        String realmGet$title = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.voteAverageIndex, rowIndex, ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$voteAverage(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        MovieRealmObjectColumnInfo columnInfo = (MovieRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.nino.inagataMovie.favorites.MovieRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.nino.inagataMovie.favorites.MovieRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.nino.inagataMovie.favorites.MovieRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$overview = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$overview();
            if (realmGet$overview != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.overviewIndex, rowIndex, realmGet$overview, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.overviewIndex, rowIndex, false);
            }
            String realmGet$releaseDate = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
            if (realmGet$releaseDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, false);
            }
            String realmGet$posterPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$posterPath();
            if (realmGet$posterPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.posterPathIndex, rowIndex, realmGet$posterPath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.posterPathIndex, rowIndex, false);
            }
            String realmGet$backdropPath = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$backdropPath();
            if (realmGet$backdropPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, realmGet$backdropPath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.backdropPathIndex, rowIndex, false);
            }
            String realmGet$title = ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.voteAverageIndex, rowIndex, ((com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) object).realmGet$voteAverage(), false);
        }
    }

    public static com.nino.inagataMovie.favorites.MovieRealmObject createDetachedCopy(com.nino.inagataMovie.favorites.MovieRealmObject realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.nino.inagataMovie.favorites.MovieRealmObject unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.nino.inagataMovie.favorites.MovieRealmObject();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.nino.inagataMovie.favorites.MovieRealmObject) cachedObject.object;
            }
            unmanagedObject = (com.nino.inagataMovie.favorites.MovieRealmObject) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface unmanagedCopy = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) unmanagedObject;
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface realmSource = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$overview(realmSource.realmGet$overview());
        unmanagedCopy.realmSet$releaseDate(realmSource.realmGet$releaseDate());
        unmanagedCopy.realmSet$posterPath(realmSource.realmGet$posterPath());
        unmanagedCopy.realmSet$backdropPath(realmSource.realmGet$backdropPath());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$voteAverage(realmSource.realmGet$voteAverage());

        return unmanagedObject;
    }

    static com.nino.inagataMovie.favorites.MovieRealmObject update(Realm realm, com.nino.inagataMovie.favorites.MovieRealmObject realmObject, com.nino.inagataMovie.favorites.MovieRealmObject newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface realmObjectTarget = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) realmObject;
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface realmObjectSource = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$overview(realmObjectSource.realmGet$overview());
        realmObjectTarget.realmSet$releaseDate(realmObjectSource.realmGet$releaseDate());
        realmObjectTarget.realmSet$posterPath(realmObjectSource.realmGet$posterPath());
        realmObjectTarget.realmSet$backdropPath(realmObjectSource.realmGet$backdropPath());
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$voteAverage(realmObjectSource.realmGet$voteAverage());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MovieRealmObject = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{overview:");
        stringBuilder.append(realmGet$overview() != null ? realmGet$overview() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{releaseDate:");
        stringBuilder.append(realmGet$releaseDate() != null ? realmGet$releaseDate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{posterPath:");
        stringBuilder.append(realmGet$posterPath() != null ? realmGet$posterPath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{backdropPath:");
        stringBuilder.append(realmGet$backdropPath() != null ? realmGet$backdropPath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{voteAverage:");
        stringBuilder.append(realmGet$voteAverage());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy aMovieRealmObject = (com_nino_inagataMovie_favorites_MovieRealmObjectRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMovieRealmObject.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMovieRealmObject.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMovieRealmObject.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
