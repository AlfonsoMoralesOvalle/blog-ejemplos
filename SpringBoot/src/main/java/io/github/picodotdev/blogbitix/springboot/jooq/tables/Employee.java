/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables;


import io.github.picodotdev.blogbitix.springboot.jooq.Jooq;
import io.github.picodotdev.blogbitix.springboot.jooq.Keys;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.records.EmployeeRecord;
import io.github.picodotdev.blogbitix.springboot.misc.TimestampConverter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

	private static final long serialVersionUID = -1087148492;

	/**
	 * The reference instance of <code>JOOQ.EMPLOYEE</code>
	 */
	public static final Employee EMPLOYEE = new Employee();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EmployeeRecord> getRecordType() {
		return EmployeeRecord.class;
	}

	/**
	 * The column <code>JOOQ.EMPLOYEE.ID</code>.
	 */
	public final TableField<EmployeeRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>JOOQ.EMPLOYEE.NAME</code>.
	 */
	public final TableField<EmployeeRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>JOOQ.EMPLOYEE.SURNAME</code>.
	 */
	public final TableField<EmployeeRecord, String> SURNAME = createField("SURNAME", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>JOOQ.EMPLOYEE.BIRTHDAY</code>.
	 */
	public final TableField<EmployeeRecord, LocalDateTime> BIRTHDAY = createField("BIRTHDAY", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new TimestampConverter());

	/**
	 * Create a <code>JOOQ.EMPLOYEE</code> table reference
	 */
	public Employee() {
		this("EMPLOYEE", null);
	}

	/**
	 * Create an aliased <code>JOOQ.EMPLOYEE</code> table reference
	 */
	public Employee(String alias) {
		this(alias, EMPLOYEE);
	}

	private Employee(String alias, Table<EmployeeRecord> aliased) {
		this(alias, aliased, null);
	}

	private Employee(String alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
		super(alias, Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<EmployeeRecord, Long> getIdentity() {
		return Keys.IDENTITY_EMPLOYEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EmployeeRecord> getPrimaryKey() {
		return Keys.PK_EMPLOYEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EmployeeRecord>> getKeys() {
		return Arrays.<UniqueKey<EmployeeRecord>>asList(Keys.PK_EMPLOYEE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Employee as(String alias) {
		return new Employee(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Employee rename(String name) {
		return new Employee(name, null);
	}
}
