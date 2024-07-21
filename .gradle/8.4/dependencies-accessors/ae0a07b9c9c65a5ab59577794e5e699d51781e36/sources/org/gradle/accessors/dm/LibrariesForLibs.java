package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ApolloLibraryAccessors laccForApolloLibraryAccessors = new ApolloLibraryAccessors(owner);
    private final BcpkixLibraryAccessors laccForBcpkixLibraryAccessors = new BcpkixLibraryAccessors(owner);
    private final BcprovLibraryAccessors laccForBcprovLibraryAccessors = new BcprovLibraryAccessors(owner);
    private final CameraLibraryAccessors laccForCameraLibraryAccessors = new CameraLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final KgraphqlLibraryAccessors laccForKgraphqlLibraryAccessors = new KgraphqlLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final LeakcanaryLibraryAccessors laccForLeakcanaryLibraryAccessors = new LeakcanaryLibraryAccessors(owner);
    private final MarkwonLibraryAccessors laccForMarkwonLibraryAccessors = new MarkwonLibraryAccessors(owner);
    private final Media3LibraryAccessors laccForMedia3LibraryAccessors = new Media3LibraryAccessors(owner);
    private final OpenaiLibraryAccessors laccForOpenaiLibraryAccessors = new OpenaiLibraryAccessors(owner);
    private final PagingLibraryAccessors laccForPagingLibraryAccessors = new PagingLibraryAccessors(owner);
    private final PdfiumLibraryAccessors laccForPdfiumLibraryAccessors = new PdfiumLibraryAccessors(owner);
    private final RefreshLibraryAccessors laccForRefreshLibraryAccessors = new RefreshLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SnakeLibraryAccessors laccForSnakeLibraryAccessors = new SnakeLibraryAccessors(owner);
    private final SubsamplingLibraryAccessors laccForSubsamplingLibraryAccessors = new SubsamplingLibraryAccessors(owner);
    private final ZtLibraryAccessors laccForZtLibraryAccessors = new ZtLibraryAccessors(owner);
    private final ZxingLibraryAccessors laccForZxingLibraryAccessors = new ZxingLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for exoplayer (com.google.android.exoplayer:exoplayer)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExoplayer() {
            return create("exoplayer");
    }

        /**
         * Creates a dependency provider for glide (com.github.bumptech.glide:glide)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGlide() {
            return create("glide");
    }

        /**
         * Creates a dependency provider for gradle (com.android.tools.build:gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGradle() {
            return create("gradle");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for guava (com.google.guava:guava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() {
            return create("guava");
    }

        /**
         * Creates a dependency provider for jsoup (org.jsoup:jsoup)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsoup() {
            return create("jsoup");
    }

        /**
         * Creates a dependency provider for ksp (com.github.bumptech.glide:ksp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKsp() {
            return create("ksp");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

        /**
         * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("okhttp");
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at apollo
     */
    public ApolloLibraryAccessors getApollo() {
        return laccForApolloLibraryAccessors;
    }

    /**
     * Returns the group of libraries at bcpkix
     */
    public BcpkixLibraryAccessors getBcpkix() {
        return laccForBcpkixLibraryAccessors;
    }

    /**
     * Returns the group of libraries at bcprov
     */
    public BcprovLibraryAccessors getBcprov() {
        return laccForBcprovLibraryAccessors;
    }

    /**
     * Returns the group of libraries at camera
     */
    public CameraLibraryAccessors getCamera() {
        return laccForCameraLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() {
        return laccForGoogleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kgraphql
     */
    public KgraphqlLibraryAccessors getKgraphql() {
        return laccForKgraphqlLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Returns the group of libraries at leakcanary
     */
    public LeakcanaryLibraryAccessors getLeakcanary() {
        return laccForLeakcanaryLibraryAccessors;
    }

    /**
     * Returns the group of libraries at markwon
     */
    public MarkwonLibraryAccessors getMarkwon() {
        return laccForMarkwonLibraryAccessors;
    }

    /**
     * Returns the group of libraries at media3
     */
    public Media3LibraryAccessors getMedia3() {
        return laccForMedia3LibraryAccessors;
    }

    /**
     * Returns the group of libraries at openai
     */
    public OpenaiLibraryAccessors getOpenai() {
        return laccForOpenaiLibraryAccessors;
    }

    /**
     * Returns the group of libraries at paging
     */
    public PagingLibraryAccessors getPaging() {
        return laccForPagingLibraryAccessors;
    }

    /**
     * Returns the group of libraries at pdfium
     */
    public PdfiumLibraryAccessors getPdfium() {
        return laccForPdfiumLibraryAccessors;
    }

    /**
     * Returns the group of libraries at refresh
     */
    public RefreshLibraryAccessors getRefresh() {
        return laccForRefreshLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at snake
     */
    public SnakeLibraryAccessors getSnake() {
        return laccForSnakeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at subsampling
     */
    public SubsamplingLibraryAccessors getSubsampling() {
        return laccForSubsamplingLibraryAccessors;
    }

    /**
     * Returns the group of libraries at zt
     */
    public ZtLibraryAccessors getZt() {
        return laccForZtLibraryAccessors;
    }

    /**
     * Returns the group of libraries at zxing
     */
    public ZxingLibraryAccessors getZxing() {
        return laccForZxingLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for drawablepainter (com.google.accompanist:accompanist-drawablepainter)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDrawablepainter() {
                return create("accompanist.drawablepainter");
        }

    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {
        private final AndroidGifLibraryAccessors laccForAndroidGifLibraryAccessors = new AndroidGifLibraryAccessors(owner);

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at android.gif
         */
        public AndroidGifLibraryAccessors getGif() {
            return laccForAndroidGifLibraryAccessors;
        }

    }

    public static class AndroidGifLibraryAccessors extends SubDependencyFactory {

        public AndroidGifLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for drawable (pl.droidsonroids.gif:android-gif-drawable)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDrawable() {
                return create("android.gif.drawable");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxDatastoreLibraryAccessors laccForAndroidxDatastoreLibraryAccessors = new AndroidxDatastoreLibraryAccessors(owner);
        private final AndroidxFragmentLibraryAccessors laccForAndroidxFragmentLibraryAccessors = new AndroidxFragmentLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxPreferenceLibraryAccessors laccForAndroidxPreferenceLibraryAccessors = new AndroidxPreferenceLibraryAccessors(owner);
        private final AndroidxWorkLibraryAccessors laccForAndroidxWorkLibraryAccessors = new AndroidxWorkLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for transition (androidx.transition:transition)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTransition() {
                return create("androidx.transition");
        }

            /**
             * Creates a dependency provider for viewpager2 (androidx.viewpager2:viewpager2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewpager2() {
                return create("androidx.viewpager2");
        }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.datastore
         */
        public AndroidxDatastoreLibraryAccessors getDatastore() {
            return laccForAndroidxDatastoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.fragment
         */
        public AndroidxFragmentLibraryAccessors getFragment() {
            return laccForAndroidxFragmentLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.preference
         */
        public AndroidxPreferenceLibraryAccessors getPreference() {
            return laccForAndroidxPreferenceLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.work
         */
        public AndroidxWorkLibraryAccessors getWork() {
            return laccForAndroidxWorkLibraryAccessors;
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.core.ktx");
        }

            /**
             * Creates a dependency provider for splashscreen (androidx.core:core-splashscreen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSplashscreen() {
                return create("androidx.core.splashscreen");
        }

    }

    public static class AndroidxDatastoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxDatastoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for preferences (androidx.datastore:datastore-preferences)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreferences() {
                return create("androidx.datastore.preferences");
        }

    }

    public static class AndroidxFragmentLibraryAccessors extends SubDependencyFactory {

        public AndroidxFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.fragment:fragment-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.fragment.ktx");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleRuntimeLibraryAccessors laccForAndroidxLifecycleRuntimeLibraryAccessors = new AndroidxLifecycleRuntimeLibraryAccessors(owner);
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for extensions (androidx.lifecycle:lifecycle-extensions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtensions() {
                return create("androidx.lifecycle.extensions");
        }

        /**
         * Returns the group of libraries at androidx.lifecycle.runtime
         */
        public AndroidxLifecycleRuntimeLibraryAccessors getRuntime() {
            return laccForAndroidxLifecycleRuntimeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForAndroidxLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class AndroidxLifecycleRuntimeLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.lifecycle.runtime.ktx");
        }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.lifecycle.viewmodel.ktx");
        }

    }

    public static class AndroidxPreferenceLibraryAccessors extends SubDependencyFactory {

        public AndroidxPreferenceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.preference:preference-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.preference.ktx");
        }

    }

    public static class AndroidxWorkLibraryAccessors extends SubDependencyFactory {
        private final AndroidxWorkRuntimeLibraryAccessors laccForAndroidxWorkRuntimeLibraryAccessors = new AndroidxWorkRuntimeLibraryAccessors(owner);

        public AndroidxWorkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.work.runtime
         */
        public AndroidxWorkRuntimeLibraryAccessors getRuntime() {
            return laccForAndroidxWorkRuntimeLibraryAccessors;
        }

    }

    public static class AndroidxWorkRuntimeLibraryAccessors extends SubDependencyFactory {

        public AndroidxWorkRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.work:work-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.work.runtime.ktx");
        }

    }

    public static class ApolloLibraryAccessors extends SubDependencyFactory {
        private final ApolloNormalizedLibraryAccessors laccForApolloNormalizedLibraryAccessors = new ApolloNormalizedLibraryAccessors(owner);

        public ApolloLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for adapters (com.apollographql.apollo3:apollo-adapters)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAdapters() {
                return create("apollo.adapters");
        }

            /**
             * Creates a dependency provider for runtime (com.apollographql.apollo3:apollo-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("apollo.runtime");
        }

        /**
         * Returns the group of libraries at apollo.normalized
         */
        public ApolloNormalizedLibraryAccessors getNormalized() {
            return laccForApolloNormalizedLibraryAccessors;
        }

    }

    public static class ApolloNormalizedLibraryAccessors extends SubDependencyFactory {
        private final ApolloNormalizedCacheLibraryAccessors laccForApolloNormalizedCacheLibraryAccessors = new ApolloNormalizedCacheLibraryAccessors(owner);

        public ApolloNormalizedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at apollo.normalized.cache
         */
        public ApolloNormalizedCacheLibraryAccessors getCache() {
            return laccForApolloNormalizedCacheLibraryAccessors;
        }

    }

    public static class ApolloNormalizedCacheLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ApolloNormalizedCacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cache (com.apollographql.apollo3:apollo-normalized-cache)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("apollo.normalized.cache");
        }

            /**
             * Creates a dependency provider for sqlite (com.apollographql.apollo3:apollo-normalized-cache-sqlite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSqlite() {
                return create("apollo.normalized.cache.sqlite");
        }

    }

    public static class BcpkixLibraryAccessors extends SubDependencyFactory {

        public BcpkixLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdk15on (org.bouncycastle:bcpkix-jdk15on)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk15on() {
                return create("bcpkix.jdk15on");
        }

    }

    public static class BcprovLibraryAccessors extends SubDependencyFactory {

        public BcprovLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdk15on (org.bouncycastle:bcprov-jdk15on)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk15on() {
                return create("bcprov.jdk15on");
        }

    }

    public static class CameraLibraryAccessors extends SubDependencyFactory {

        public CameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for camera2 (androidx.camera:camera-camera2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCamera2() {
                return create("camera.camera2");
        }

            /**
             * Creates a dependency provider for core (androidx.camera:camera-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("camera.core");
        }

            /**
             * Creates a dependency provider for lifecycle (androidx.camera:camera-lifecycle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycle() {
                return create("camera.lifecycle");
        }

            /**
             * Creates a dependency provider for view (androidx.camera:camera-view)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getView() {
                return create("camera.view");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final CoilNetworkLibraryAccessors laccForCoilNetworkLibraryAccessors = new CoilNetworkLibraryAccessors(owner);

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coil (io.coil-kt.coil3:coil)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coil");
        }

            /**
             * Creates a dependency provider for compose (io.coil-kt.coil3:coil-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("coil.compose");
        }

            /**
             * Creates a dependency provider for gif (io.coil-kt.coil3:coil-gif)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGif() {
                return create("coil.gif");
        }

            /**
             * Creates a dependency provider for svg (io.coil-kt.coil3:coil-svg)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSvg() {
                return create("coil.svg");
        }

            /**
             * Creates a dependency provider for video (io.coil-kt.coil3:coil-video)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() {
                return create("coil.video");
        }

        /**
         * Returns the group of libraries at coil.network
         */
        public CoilNetworkLibraryAccessors getNetwork() {
            return laccForCoilNetworkLibraryAccessors;
        }

    }

    public static class CoilNetworkLibraryAccessors extends SubDependencyFactory {

        public CoilNetworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktor (io.coil-kt.coil3:coil-network-ktor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtor() {
                return create("coil.network.ktor");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeFoundationLibraryAccessors laccForComposeFoundationLibraryAccessors = new ComposeFoundationLibraryAccessors(owner);
        private final ComposeLifecycleLibraryAccessors laccForComposeLifecycleLibraryAccessors = new ComposeLifecycleLibraryAccessors(owner);
        private final ComposeMaterialLibraryAccessors laccForComposeMaterialLibraryAccessors = new ComposeMaterialLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() {
                return create("compose.activity");
        }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("compose.bom");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("compose.material3");
        }

            /**
             * Creates a dependency provider for navigation (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() {
                return create("compose.navigation");
        }

            /**
             * Creates a dependency provider for runtime (androidx.compose.runtime:runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("compose.runtime");
        }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("compose.ui");
        }

        /**
         * Returns the group of libraries at compose.foundation
         */
        public ComposeFoundationLibraryAccessors getFoundation() {
            return laccForComposeFoundationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.lifecycle
         */
        public ComposeLifecycleLibraryAccessors getLifecycle() {
            return laccForComposeLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.material
         */
        public ComposeMaterialLibraryAccessors getMaterial() {
            return laccForComposeMaterialLibraryAccessors;
        }

    }

    public static class ComposeFoundationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.foundation");
        }

            /**
             * Creates a dependency provider for layout (androidx.compose.foundation:foundation-layout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLayout() {
                return create("compose.foundation.layout");
        }

    }

    public static class ComposeLifecycleLibraryAccessors extends SubDependencyFactory {

        public ComposeLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("compose.lifecycle.runtime");
        }

    }

    public static class ComposeMaterialLibraryAccessors extends SubDependencyFactory {
        private final ComposeMaterialIconsLibraryAccessors laccForComposeMaterialIconsLibraryAccessors = new ComposeMaterialIconsLibraryAccessors(owner);

        public ComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at compose.material.icons
         */
        public ComposeMaterialIconsLibraryAccessors getIcons() {
            return laccForComposeMaterialIconsLibraryAccessors;
        }

    }

    public static class ComposeMaterialIconsLibraryAccessors extends SubDependencyFactory {

        public ComposeMaterialIconsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for extended (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtended() {
                return create("compose.material.icons.extended");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {
        private final FirebaseCrashlyticsLibraryAccessors laccForFirebaseCrashlyticsLibraryAccessors = new FirebaseCrashlyticsLibraryAccessors(owner);

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("firebase.bom");
        }

        /**
         * Returns the group of libraries at firebase.crashlytics
         */
        public FirebaseCrashlyticsLibraryAccessors getCrashlytics() {
            return laccForFirebaseCrashlyticsLibraryAccessors;
        }

    }

    public static class FirebaseCrashlyticsLibraryAccessors extends SubDependencyFactory {

        public FirebaseCrashlyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradle (com.google.firebase:firebase-crashlytics-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() {
                return create("firebase.crashlytics.gradle");
        }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.crashlytics.ktx");
        }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for services (com.google.gms:google-services)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServices() {
                return create("google.services");
        }

    }

    public static class KgraphqlLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KgraphqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kgraphql (com.apurebase:kgraphql)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("kgraphql");
        }

            /**
             * Creates a dependency provider for ktor (com.apurebase:kgraphql-ktor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtor() {
                return create("kgraphql.ktor");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinGradleLibraryAccessors laccForKotlinGradleLibraryAccessors = new KotlinGradleLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlin.gradle
         */
        public KotlinGradleLibraryAccessors getGradle() {
            return laccForKotlinGradleLibraryAccessors;
        }

    }

    public static class KotlinGradleLibraryAccessors extends SubDependencyFactory {

        public KotlinGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() {
                return create("kotlin.gradle.plugin");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for datetime (org.jetbrains.kotlinx:kotlinx-datetime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatetime() {
                return create("kotlinx.datetime");
        }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("kotlinx.coroutines.android");
        }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

            /**
             * Creates a dependency provider for guava (org.jetbrains.kotlinx:kotlinx-coroutines-guava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGuava() {
                return create("kotlinx.coroutines.guava");
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("kotlinx.serialization.json");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {
        private final KtorClientLibraryAccessors laccForKtorClientLibraryAccessors = new KtorClientLibraryAccessors(owner);
        private final KtorNetworkLibraryAccessors laccForKtorNetworkLibraryAccessors = new KtorNetworkLibraryAccessors(owner);
        private final KtorSerializationLibraryAccessors laccForKtorSerializationLibraryAccessors = new KtorSerializationLibraryAccessors(owner);
        private final KtorServerLibraryAccessors laccForKtorServerLibraryAccessors = new KtorServerLibraryAccessors(owner);

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ktor.client
         */
        public KtorClientLibraryAccessors getClient() {
            return laccForKtorClientLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.network
         */
        public KtorNetworkLibraryAccessors getNetwork() {
            return laccForKtorNetworkLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.serialization
         */
        public KtorSerializationLibraryAccessors getSerialization() {
            return laccForKtorSerializationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server
         */
        public KtorServerLibraryAccessors getServer() {
            return laccForKtorServerLibraryAccessors;
        }

    }

    public static class KtorClientLibraryAccessors extends SubDependencyFactory {

        public KtorClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cio (io.ktor:ktor-client-cio)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCio() {
                return create("ktor.client.cio");
        }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-client-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ktor.client.core");
        }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("ktor.client.logging");
        }

    }

    public static class KtorNetworkLibraryAccessors extends SubDependencyFactory {
        private final KtorNetworkTlsLibraryAccessors laccForKtorNetworkTlsLibraryAccessors = new KtorNetworkTlsLibraryAccessors(owner);

        public KtorNetworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ktor.network.tls
         */
        public KtorNetworkTlsLibraryAccessors getTls() {
            return laccForKtorNetworkTlsLibraryAccessors;
        }

    }

    public static class KtorNetworkTlsLibraryAccessors extends SubDependencyFactory {

        public KtorNetworkTlsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for certificates (io.ktor:ktor-network-tls-certificates)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCertificates() {
                return create("ktor.network.tls.certificates");
        }

    }

    public static class KtorSerializationLibraryAccessors extends SubDependencyFactory {
        private final KtorSerializationKotlinxLibraryAccessors laccForKtorSerializationKotlinxLibraryAccessors = new KtorSerializationKotlinxLibraryAccessors(owner);

        public KtorSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ktor.serialization.kotlinx
         */
        public KtorSerializationKotlinxLibraryAccessors getKotlinx() {
            return laccForKtorSerializationKotlinxLibraryAccessors;
        }

    }

    public static class KtorSerializationKotlinxLibraryAccessors extends SubDependencyFactory {

        public KtorSerializationKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (io.ktor:ktor-serialization-kotlinx-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("ktor.serialization.kotlinx.json");
        }

    }

    public static class KtorServerLibraryAccessors extends SubDependencyFactory {
        private final KtorServerAutoLibraryAccessors laccForKtorServerAutoLibraryAccessors = new KtorServerAutoLibraryAccessors(owner);
        private final KtorServerCachingLibraryAccessors laccForKtorServerCachingLibraryAccessors = new KtorServerCachingLibraryAccessors(owner);
        private final KtorServerConditionalLibraryAccessors laccForKtorServerConditionalLibraryAccessors = new KtorServerConditionalLibraryAccessors(owner);
        private final KtorServerContentLibraryAccessors laccForKtorServerContentLibraryAccessors = new KtorServerContentLibraryAccessors(owner);
        private final KtorServerForwardedLibraryAccessors laccForKtorServerForwardedLibraryAccessors = new KtorServerForwardedLibraryAccessors(owner);
        private final KtorServerPartialLibraryAccessors laccForKtorServerPartialLibraryAccessors = new KtorServerPartialLibraryAccessors(owner);

        public KtorServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compression (io.ktor:ktor-server-compression)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompression() {
                return create("ktor.server.compression");
        }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-server-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ktor.server.core");
        }

            /**
             * Creates a dependency provider for cors (io.ktor:ktor-server-cors)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCors() {
                return create("ktor.server.cors");
        }

            /**
             * Creates a dependency provider for netty (io.ktor:ktor-server-netty)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNetty() {
                return create("ktor.server.netty");
        }

            /**
             * Creates a dependency provider for websockets (io.ktor:ktor-server-websockets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWebsockets() {
                return create("ktor.server.websockets");
        }

        /**
         * Returns the group of libraries at ktor.server.auto
         */
        public KtorServerAutoLibraryAccessors getAuto() {
            return laccForKtorServerAutoLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server.caching
         */
        public KtorServerCachingLibraryAccessors getCaching() {
            return laccForKtorServerCachingLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server.conditional
         */
        public KtorServerConditionalLibraryAccessors getConditional() {
            return laccForKtorServerConditionalLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server.content
         */
        public KtorServerContentLibraryAccessors getContent() {
            return laccForKtorServerContentLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server.forwarded
         */
        public KtorServerForwardedLibraryAccessors getForwarded() {
            return laccForKtorServerForwardedLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ktor.server.partial
         */
        public KtorServerPartialLibraryAccessors getPartial() {
            return laccForKtorServerPartialLibraryAccessors;
        }

    }

    public static class KtorServerAutoLibraryAccessors extends SubDependencyFactory {
        private final KtorServerAutoHeadLibraryAccessors laccForKtorServerAutoHeadLibraryAccessors = new KtorServerAutoHeadLibraryAccessors(owner);

        public KtorServerAutoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ktor.server.auto.head
         */
        public KtorServerAutoHeadLibraryAccessors getHead() {
            return laccForKtorServerAutoHeadLibraryAccessors;
        }

    }

    public static class KtorServerAutoHeadLibraryAccessors extends SubDependencyFactory {

        public KtorServerAutoHeadLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for response (io.ktor:ktor-server-auto-head-response)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResponse() {
                return create("ktor.server.auto.head.response");
        }

    }

    public static class KtorServerCachingLibraryAccessors extends SubDependencyFactory {

        public KtorServerCachingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for headers (io.ktor:ktor-server-caching-headers)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHeaders() {
                return create("ktor.server.caching.headers");
        }

    }

    public static class KtorServerConditionalLibraryAccessors extends SubDependencyFactory {

        public KtorServerConditionalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for headers (io.ktor:ktor-server-conditional-headers)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHeaders() {
                return create("ktor.server.conditional.headers");
        }

    }

    public static class KtorServerContentLibraryAccessors extends SubDependencyFactory {

        public KtorServerContentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for negotiation (io.ktor:ktor-server-content-negotiation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNegotiation() {
                return create("ktor.server.content.negotiation");
        }

    }

    public static class KtorServerForwardedLibraryAccessors extends SubDependencyFactory {

        public KtorServerForwardedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for header (io.ktor:ktor-server-forwarded-header)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHeader() {
                return create("ktor.server.forwarded.header");
        }

    }

    public static class KtorServerPartialLibraryAccessors extends SubDependencyFactory {

        public KtorServerPartialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for content (io.ktor:ktor-server-partial-content)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getContent() {
                return create("ktor.server.partial.content");
        }

    }

    public static class LeakcanaryLibraryAccessors extends SubDependencyFactory {

        public LeakcanaryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.squareup.leakcanary:leakcanary-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("leakcanary.android");
        }

    }

    public static class MarkwonLibraryAccessors extends SubDependencyFactory {

        public MarkwonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.noties.markwon:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("markwon.core");
        }

            /**
             * Creates a dependency provider for html (io.noties.markwon:html)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHtml() {
                return create("markwon.html");
        }

            /**
             * Creates a dependency provider for latex (io.noties.markwon:ext-latex)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLatex() {
                return create("markwon.latex");
        }

            /**
             * Creates a dependency provider for linkify (io.noties.markwon:linkify)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLinkify() {
                return create("markwon.linkify");
        }

            /**
             * Creates a dependency provider for strikethrough (io.noties.markwon:ext-strikethrough)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStrikethrough() {
                return create("markwon.strikethrough");
        }

            /**
             * Creates a dependency provider for tables (io.noties.markwon:ext-tables)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTables() {
                return create("markwon.tables");
        }

            /**
             * Creates a dependency provider for tasklist (io.noties.markwon:ext-tasklist)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTasklist() {
                return create("markwon.tasklist");
        }

    }

    public static class Media3LibraryAccessors extends SubDependencyFactory {

        public Media3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cast (androidx.media3:media3-cast)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCast() {
                return create("media3.cast");
        }

            /**
             * Creates a dependency provider for dash (androidx.media3:media3-exoplayer-dash)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDash() {
                return create("media3.dash");
        }

            /**
             * Creates a dependency provider for datasource (androidx.media3:media3-datasource)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatasource() {
                return create("media3.datasource");
        }

            /**
             * Creates a dependency provider for exoplayer (androidx.media3:media3-exoplayer)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExoplayer() {
                return create("media3.exoplayer");
        }

            /**
             * Creates a dependency provider for hls (androidx.media3:media3-exoplayer-hls)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHls() {
                return create("media3.hls");
        }

            /**
             * Creates a dependency provider for session (androidx.media3:media3-session)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSession() {
                return create("media3.session");
        }

            /**
             * Creates a dependency provider for ui (androidx.media3:media3-ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("media3.ui");
        }

    }

    public static class OpenaiLibraryAccessors extends SubDependencyFactory {

        public OpenaiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (com.aallam.openai:openai-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient() {
                return create("openai.client");
        }

    }

    public static class PagingLibraryAccessors extends SubDependencyFactory {

        public PagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.paging:paging-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("paging.runtime");
        }

    }

    public static class PdfiumLibraryAccessors extends SubDependencyFactory {

        public PdfiumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.github.barteksc:pdfium-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("pdfium.android");
        }

    }

    public static class RefreshLibraryAccessors extends SubDependencyFactory {
        private final RefreshLayoutLibraryAccessors laccForRefreshLayoutLibraryAccessors = new RefreshLayoutLibraryAccessors(owner);

        public RefreshLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at refresh.layout
         */
        public RefreshLayoutLibraryAccessors getLayout() {
            return laccForRefreshLayoutLibraryAccessors;
        }

    }

    public static class RefreshLayoutLibraryAccessors extends SubDependencyFactory {

        public RefreshLayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kernel (io.github.scwang90:refresh-layout-kernel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKernel() {
                return create("refresh.layout.kernel");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("room.compiler");
        }

            /**
             * Creates a dependency provider for gradle (androidx.room:room-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() {
                return create("room.gradle");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("room.runtime");
        }

            /**
             * Creates a dependency provider for testing (androidx.room:room-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() {
                return create("room.testing");
        }

    }

    public static class SnakeLibraryAccessors extends SubDependencyFactory {

        public SnakeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for yaml (com.github.bmoliveira:snake-yaml)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getYaml() {
                return create("snake.yaml");
        }

    }

    public static class SubsamplingLibraryAccessors extends SubDependencyFactory {
        private final SubsamplingScaleLibraryAccessors laccForSubsamplingScaleLibraryAccessors = new SubsamplingScaleLibraryAccessors(owner);

        public SubsamplingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at subsampling.scale
         */
        public SubsamplingScaleLibraryAccessors getScale() {
            return laccForSubsamplingScaleLibraryAccessors;
        }

    }

    public static class SubsamplingScaleLibraryAccessors extends SubDependencyFactory {
        private final SubsamplingScaleImageLibraryAccessors laccForSubsamplingScaleImageLibraryAccessors = new SubsamplingScaleImageLibraryAccessors(owner);

        public SubsamplingScaleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at subsampling.scale.image
         */
        public SubsamplingScaleImageLibraryAccessors getImage() {
            return laccForSubsamplingScaleImageLibraryAccessors;
        }

    }

    public static class SubsamplingScaleImageLibraryAccessors extends SubDependencyFactory {
        private final SubsamplingScaleImageViewLibraryAccessors laccForSubsamplingScaleImageViewLibraryAccessors = new SubsamplingScaleImageViewLibraryAccessors(owner);

        public SubsamplingScaleImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at subsampling.scale.image.view
         */
        public SubsamplingScaleImageViewLibraryAccessors getView() {
            return laccForSubsamplingScaleImageViewLibraryAccessors;
        }

    }

    public static class SubsamplingScaleImageViewLibraryAccessors extends SubDependencyFactory {

        public SubsamplingScaleImageViewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for androidx (com.davemorrissey.labs:subsampling-scale-image-view-androidx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroidx() {
                return create("subsampling.scale.image.view.androidx");
        }

    }

    public static class ZtLibraryAccessors extends SubDependencyFactory {

        public ZtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for zip (org.zeroturnaround:zt-zip)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getZip() {
                return create("zt.zip");
        }

    }

    public static class ZxingLibraryAccessors extends SubDependencyFactory {

        public ZxingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.google.zxing:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("zxing.core");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanistDrawablepainterVersion (0.34.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanistDrawablepainterVersion() { return getVersion("accompanistDrawablepainterVersion"); }

            /**
             * Returns the version associated to this alias: activityComposeVersion (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivityComposeVersion() { return getVersion("activityComposeVersion"); }

            /**
             * Returns the version associated to this alias: androidGifDrawableVersion (1.2.28)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidGifDrawableVersion() { return getVersion("androidGifDrawableVersion"); }

            /**
             * Returns the version associated to this alias: apollo (3.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApollo() { return getVersion("apollo"); }

            /**
             * Returns the version associated to this alias: appcompatVersion (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompatVersion() { return getVersion("appcompatVersion"); }

            /**
             * Returns the version associated to this alias: bcprovJdk15onVersion (1.70)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBcprovJdk15onVersion() { return getVersion("bcprovJdk15onVersion"); }

            /**
             * Returns the version associated to this alias: cameraCoreVersion (1.4.0-beta02)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCameraCoreVersion() { return getVersion("cameraCoreVersion"); }

            /**
             * Returns the version associated to this alias: coil (3.0.0-alpha06)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoil() { return getVersion("coil"); }

            /**
             * Returns the version associated to this alias: compose (1.6.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: composeBom (2024.06.00)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeBom() { return getVersion("composeBom"); }

            /**
             * Returns the version associated to this alias: coreKtxVersion (1.13.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreKtxVersion() { return getVersion("coreKtxVersion"); }

            /**
             * Returns the version associated to this alias: coreSplashscreenVersion (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreSplashscreenVersion() { return getVersion("coreSplashscreenVersion"); }

            /**
             * Returns the version associated to this alias: coreVersion (3.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreVersion() { return getVersion("coreVersion"); }

            /**
             * Returns the version associated to this alias: datastorePreferencesVersion (1.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastorePreferencesVersion() { return getVersion("datastorePreferencesVersion"); }

            /**
             * Returns the version associated to this alias: devtoolsKspVersion (1.9.23-1.0.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDevtoolsKspVersion() { return getVersion("devtoolsKspVersion"); }

            /**
             * Returns the version associated to this alias: exoplayerVersion (2.19.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExoplayerVersion() { return getVersion("exoplayerVersion"); }

            /**
             * Returns the version associated to this alias: firebaseBomVersion (33.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseBomVersion() { return getVersion("firebaseBomVersion"); }

            /**
             * Returns the version associated to this alias: firebaseCrashlyticsGradleVersion (3.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseCrashlyticsGradleVersion() { return getVersion("firebaseCrashlyticsGradleVersion"); }

            /**
             * Returns the version associated to this alias: firebaseCrashlyticsKtxVersion (19.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseCrashlyticsKtxVersion() { return getVersion("firebaseCrashlyticsKtxVersion"); }

            /**
             * Returns the version associated to this alias: fragmentKtxVersion (1.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFragmentKtxVersion() { return getVersion("fragmentKtxVersion"); }

            /**
             * Returns the version associated to this alias: glideVersion (4.16.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGlideVersion() { return getVersion("glideVersion"); }

            /**
             * Returns the version associated to this alias: googleServicesVersion (4.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleServicesVersion() { return getVersion("googleServicesVersion"); }

            /**
             * Returns the version associated to this alias: gradle (8.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradle() { return getVersion("gradle"); }

            /**
             * Returns the version associated to this alias: gsonVersion (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGsonVersion() { return getVersion("gsonVersion"); }

            /**
             * Returns the version associated to this alias: guavaVersion (33.0.0-jre)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGuavaVersion() { return getVersion("guavaVersion"); }

            /**
             * Returns the version associated to this alias: jsoupVersion (1.15.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJsoupVersion() { return getVersion("jsoupVersion"); }

            /**
             * Returns the version associated to this alias: kgraphql (0.19.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKgraphql() { return getVersion("kgraphql"); }

            /**
             * Returns the version associated to this alias: kotlinGradlePluginVersion (1.9.23)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinGradlePluginVersion() { return getVersion("kotlinGradlePluginVersion"); }

            /**
             * Returns the version associated to this alias: kotlinxCoroutinesVersion (1.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxCoroutinesVersion() { return getVersion("kotlinxCoroutinesVersion"); }

            /**
             * Returns the version associated to this alias: kotlinxDatetimeVersion (0.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxDatetimeVersion() { return getVersion("kotlinxDatetimeVersion"); }

            /**
             * Returns the version associated to this alias: kotlinxSerializationJsonVersion (1.6.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxSerializationJsonVersion() { return getVersion("kotlinxSerializationJsonVersion"); }

            /**
             * Returns the version associated to this alias: ktor (3.0.0-beta-1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: leakcanaryAndroidVersion (2.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLeakcanaryAndroidVersion() { return getVersion("leakcanaryAndroidVersion"); }

            /**
             * Returns the version associated to this alias: lifecycleExtensionsVersion (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycleExtensionsVersion() { return getVersion("lifecycleExtensionsVersion"); }

            /**
             * Returns the version associated to this alias: lifecycleViewmodelKtxVersion (2.8.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycleViewmodelKtxVersion() { return getVersion("lifecycleViewmodelKtxVersion"); }

            /**
             * Returns the version associated to this alias: markwon (4.6.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMarkwon() { return getVersion("markwon"); }

            /**
             * Returns the version associated to this alias: material3Version (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial3Version() { return getVersion("material3Version"); }

            /**
             * Returns the version associated to this alias: materialIconsExtendedVersion (1.7.0-beta03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterialIconsExtendedVersion() { return getVersion("materialIconsExtendedVersion"); }

            /**
             * Returns the version associated to this alias: materialVersion (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterialVersion() { return getVersion("materialVersion"); }

            /**
             * Returns the version associated to this alias: media3 (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMedia3() { return getVersion("media3"); }

            /**
             * Returns the version associated to this alias: navigationComposeVersion (2.7.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigationComposeVersion() { return getVersion("navigationComposeVersion"); }

            /**
             * Returns the version associated to this alias: okhttpVersion (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttpVersion() { return getVersion("okhttpVersion"); }

            /**
             * Returns the version associated to this alias: openaiClientVersion (3.6.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpenaiClientVersion() { return getVersion("openaiClientVersion"); }

            /**
             * Returns the version associated to this alias: pagingVersion (3.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPagingVersion() { return getVersion("pagingVersion"); }

            /**
             * Returns the version associated to this alias: pdfiumAndroidVersion (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPdfiumAndroidVersion() { return getVersion("pdfiumAndroidVersion"); }

            /**
             * Returns the version associated to this alias: preferenceKtxVersion (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPreferenceKtxVersion() { return getVersion("preferenceKtxVersion"); }

            /**
             * Returns the version associated to this alias: refreshLayoutKernelVersion (2.0.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRefreshLayoutKernelVersion() { return getVersion("refreshLayoutKernelVersion"); }

            /**
             * Returns the version associated to this alias: room (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: snakeYamlVersion (v1.18-android)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSnakeYamlVersion() { return getVersion("snakeYamlVersion"); }

            /**
             * Returns the version associated to this alias: subsamplingScaleImageViewAndroidxVersion (3.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSubsamplingScaleImageViewAndroidxVersion() { return getVersion("subsamplingScaleImageViewAndroidxVersion"); }

            /**
             * Returns the version associated to this alias: transitionVersion (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTransitionVersion() { return getVersion("transitionVersion"); }

            /**
             * Returns the version associated to this alias: viewpager2Version (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getViewpager2Version() { return getVersion("viewpager2Version"); }

            /**
             * Returns the version associated to this alias: workRuntimeKtxVersion (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWorkRuntimeKtxVersion() { return getVersion("workRuntimeKtxVersion"); }

            /**
             * Returns the version associated to this alias: ztZipVersion (1.16)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getZtZipVersion() { return getVersion("ztZipVersion"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final DevtoolsPluginAccessors paccForDevtoolsPluginAccessors = new DevtoolsPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.devtools
         */
        public DevtoolsPluginAccessors getDevtools() {
            return paccForDevtoolsPluginAccessors;
        }

    }

    public static class DevtoolsPluginAccessors extends PluginFactory {

        public DevtoolsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for devtools.ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("devtools.ksp"); }

    }

}
