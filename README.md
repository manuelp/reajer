# reajer

![Yeah, Google!](https://pbs.twimg.com/media/BFTn2mgCQAAWZHM.png:large)

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

The only other requirement is a potentially empty PostgreSQL database schema (you'll need the URL and credentials with all privileges on that schema). By default reajer connects to a local `reajer` database with credentials `admin` for both username ad password.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

If you want to connect to a database different from the default one, you can configure the connection with the `DATABASE_URL` environment variable. For example:

    DATABASE_URL="postgres://username:password@hostname:port/schema" lein ring server

## License

Copyright © 2013 FIXME
