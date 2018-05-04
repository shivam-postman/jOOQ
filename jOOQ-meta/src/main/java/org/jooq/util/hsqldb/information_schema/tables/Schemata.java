/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.hsqldb.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.util.hsqldb.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends TableImpl<Record> {

    private static final long serialVersionUID = -1258135035;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SCHEMATA</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField("CATALOG_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
     */
    public final TableField<Record, String> SCHEMA_OWNER = createField("SCHEMA_OWNER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_CATALOG = createField("DEFAULT_CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_SCHEMA = createField("DEFAULT_CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField("DEFAULT_CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SQL_PATH</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata() {
        this(DSL.name("SCHEMATA"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    private Schemata(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }
}