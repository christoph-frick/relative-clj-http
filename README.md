# relative-clj-http

Provide tools to keep a config map around a default
[clj-http](https://github.com/dakrone/clj-http) request and do relative
manipulation to it -- for now or maybe ever: client only.

## Usage

Some examples:

```clojure
; require
user=> (require '[relative-clj-http.client :as c])
nil
; a default config for convenience
user=> c/default-config
{:base-url "http://localhost:8080"
 :request {:as :auto :coerce :always :debug false :throw-exceptions false}}
; relative "change directory"
user=> (c/cd c/default-config "/api/1.0")
{:base-url "http://localhost:8080"
 :current-url "http://localhost:8080/api/1.0"
 :previous-url "http://localhost:8080"
 :request {:as :auto :coerce :always :debug false :throw-exceptions false}}

```

See the [API docs](https://christoph-frick.github.io/relative-clj-http/).

## License

Copyright © 2018 Christoph Frick

Released under the MIT License: http://www.opensource.org/licenses/mit-license.php
