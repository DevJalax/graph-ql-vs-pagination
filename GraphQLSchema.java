@GraphQLSchema
public class GraphQLSchema {
    @Bean
    public GraphQL graphQL() {
        return GraphQL.newGraphQL(schema).build();
    }

    @Bean
    public Schema schema() {
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new QueryResolver())
                .build();
    }
}
