package com.varman.myrecipe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {
    private final String KEYSPACE_NAME = "myrecipe_keyspace";
    @Override
    protected String getKeyspaceName() {
        return KEYSPACE_NAME;
    }
    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.RECREATE_DROP_UNUSED;
    }
}
