# vertica-hibernate5-dialect
Patching vendor's Vertica dialect to support Hibernate 5

Vendor's VerticaDialect for Hibernate 1.0.0 (published on <a href="https://marketplace.microfocus.com/vertica/content/hibernate">Vertica Marketplace</a>), is not fully compatible with Hibernate 5.

Fixing dialect to support identity columns. Without this patch you'll receive errors like 'org.hibernate.dialect.identity.IdentityColumnSupportImpl does not support identity key generation' in grails 3.2 etc. 
