# Mondial Relay Library

![Maven build](https://github.com/DjihadBengati/mondial-relay/actions/workflows/maven.yml/badge.svg) ![Coverage](.github/badges/jacoco.svg)

![alt text](Mondial-relay.svg)

## Mondial Relay documentation

* FR documentation [link](web-service-solution-v511-fr.pdf)
* EN documentation [link](web-service-solution-v511-en.pdf)

## Functions

This library covers the following functions:
| Function | Description |
|---|---|
| WSI2_RechercheCP | This function permits to have a list of communities and zip codes with the town’s name |
| WSI4_PointRelais_Recherche | This method permits to search the 30 nearest Points Relais® from a given location (from a GPS address or by both Zip code/Country). The results can be sorted by Points Relais® trade type. |

## Configuration

All the calls to the Web Service method will be secured with a control key. The algorithm for the calculation of this
control key is detailed further in this document.
Test credentials (already included inside the library as default values):
* Enseigne (brand): **BDTEST13**
* Private key: **PrivateK**

You can define new creadentials using the `application.properties` file:
```
mondialrelay.enseigne=<value>
mondialrelay.key=<value>
```

Licensed under the MIT License.

Made with ❤️ by [Djihad BENGATI](https://twitter.com/DjihadBENGATI)
