<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

/**
 * dummy
 */
class OtherObject
{
    #[DTA\Data(field: "myOnlyProperty2", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\ExampleResponse::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\ExampleResponse::class])]
    public \App\DTO\ExampleResponse|null $my_only_property2 = null;

}
