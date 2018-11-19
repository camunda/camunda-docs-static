---

title: 'Release Policy'
weight: 60

menu:
  main:
    name: "Release Policy"
    identifier: "release-policy"

---

## Community vs. Enterprise Releases

There is both a community and an enterprise edition of Camunda BPM. Among these, we distinguish between four different types of releases:

1. **Major Release**: The Major release contains features and bugfixes. It is fully tested and meant to be used for production systems. The Major release may contain incompatible API changes. The release is done in parallel for the community edition and for the enterprise edition.
2. **Minor Release**: The Minor release contains features and bugfixes. It is fully tested and meant to be used for production systems. In Minor releases we add functionality in a backwards compatible manner. The release is done in parallel for the community edition and for the enterprise edition.
3. **Development Release**: On the community branch and on the enterprise branch we release _ALPHA_ versions in short iteration cycles. Development releases contain the latest features and bug fixes. The Development release is not fully tested and is a snapshot of the current development state.
4. **Patch Release**: On the enterprise branch we perform patch releases, in which we backport the latest bug fixes. Patch releases are fully tested and are meant to be used for production systems. Patch releases do not contain new features and are only available to enterprise customers.

The following drawing illustrates the different release types for the community edition and the enterprise editions.

{{< img src="../img/releases.png" title="Releases" >}}

The Camunda versioning scheme follows the MAJOR.MINOR.PATCH pattern put forward by [Semantic Versioning](http://semver.org/).
